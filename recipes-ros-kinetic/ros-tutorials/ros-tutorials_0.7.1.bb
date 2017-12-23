# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ros_tutorials contains packages that demonstrate various features of ROS,     as"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp-tutorials rospy-tutorials turtlesim"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/kinetic/ros_tutorials/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ef1471b5533a0e51ea0ff1192484a01e"
SRC_URI[sha256sum] = "6eddcf952421df344dba93b2966f84d8f78c12d431cd91bb8c5d63176516bf84"
S = "${WORKDIR}/ros_tutorials-release-release-kinetic-ros_tutorials-0.7.1-0"

inherit catkin
