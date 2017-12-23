# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The actionlib stack provides a standardized interface for     interfacing with p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs boost catkin-native message-generation message-runtime python-wxtools roscpp roslib rospy rostest rostopic std-msgs"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.11.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "28c207f947f93afabb866a49dc3e5a54"
SRC_URI[sha256sum] = "328a2bbb5befe4855eb0628caa0d8fb642a47ce976492c632d8d2fb8399f541c"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.11.11-0"

inherit catkin
