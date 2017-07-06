# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost catkin cv_bridge diagnostic_msgs dynamic_reconfigure geographic_msgs geometry_msgs gps_common libgeos++-dev nodelet pluginlib proj roscpp rospy sensor_msgs swri_math_util swri_roscpp swri_yaml_util tf topic_tools yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_transform_util/0.3.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98a1cb070699b461b9a777b768c32058"
SRC_URI[sha256sum] = "6e5caba809c8b10f715119db8f305f1c93d817756fa5d26928211a6b6273f333"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
