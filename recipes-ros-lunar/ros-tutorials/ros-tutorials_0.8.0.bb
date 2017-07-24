# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ros_tutorials contains packages that demonstrate various features of ROS,     as"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native roscpp-tutorials rospy-tutorials turtlesim"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/ros_tutorials/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2d0515ad194145dde126b6def0907b6"
SRC_URI[sha256sum] = "8fd5b36eb963ba329793f0293c03e1480af402d7c3219760eb3a183d822889bc"
S = "${WORKDIR}/ros_tutorials-release-release-lunar-ros_tutorials-0.8.0-0"

inherit catkin
