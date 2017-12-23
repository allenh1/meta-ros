# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package which implements capabilities, including code to parse capability interf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bondpy catkin-native message-generation message-runtime nodelet python-pyyaml roslaunch rospy rostest std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b570bfec092cbd71862b5b1c399d688c"
SRC_URI[sha256sum] = "0e077da92875d7bec29456cecf7efcd16f42e14bfb8e28ced30e86c6d9d5ff9c"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.2.0-0"

inherit catkin
