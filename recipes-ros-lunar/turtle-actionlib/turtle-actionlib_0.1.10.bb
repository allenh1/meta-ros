# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtle_actionlib demonstrates how to write an action server and client with the "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib actionlib_msgs angles catkin geometry_msgs message_generation message_runtime rosconsole roscpp std_msgs turtlesim"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/lunar/turtle_actionlib/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3a2c27c60aeddeb05414a53d5e19da23"
SRC_URI[sha256sum] = "0a616f9b31841011a0aa1300b9a2982f7f65350092284ec05d67442eb1836230"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
