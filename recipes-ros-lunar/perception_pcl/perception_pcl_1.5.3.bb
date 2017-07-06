# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=17;endline=17;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin pcl_conversions pcl_msgs pcl_ros"
SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/lunar/perception_pcl/1.5.3-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0ded8cbf2cb947ae10c49cc9ec0a863"
SRC_URI[sha256sum] = "1e92abd8ae7005d0b5d3625565f97ed2403ffac2dc9332f1835918e6b81e65d2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
