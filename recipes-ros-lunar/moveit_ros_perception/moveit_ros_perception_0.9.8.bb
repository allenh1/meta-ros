# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=13;endline=13;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cv_bridge eigen glut image_transport libglew-dev message_filters moveit_core moveit_msgs octomap opengl pluginlib rosconsole roscpp sensor_msgs tf tf_conversions urdf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_perception/0.9.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a8bddbdf37954407225f7f108e905c7c"
SRC_URI[sha256sum] = "deb22798c0b51d1acd7b59b4e200805a9b960f7d5174ec9c7eafdec474f95f75"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
