# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rostune is a tool that helps ROS developers distribute their nodes in the most e"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs topic-tools"
SRC_URI = "https://github.com/roboskel/${PN}-release/archive/release/kinetic/${PN}/1.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2b95e46af2bdeb974fb59c78ee7f866"
SRC_URI[sha256sum] = "534824c7b7e90a2a392ddb2bd82ac53ee867626be2a781a8fe55438afca1a6a7"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.0.7-0"

inherit catkin
