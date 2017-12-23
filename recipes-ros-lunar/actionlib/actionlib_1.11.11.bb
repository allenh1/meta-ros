# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The actionlib stack provides a standardized interface for     interfacing with p"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs boost catkin-native catkin message-generation message-runtime python-wxtools roscpp roslib rospy rostest rostopic std-msgs"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.11.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ac55c1b6dd220705d110f74e11d9a0f"
SRC_URI[sha256sum] = "482b6a463c143ba1398f6d14ed49517a986175ac148abb98fa71aa255832ea7d"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.11.11-0"

inherit catkin
