# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Makes it possible to run the ros_ethercat_loop without using sudo. Forked from p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libcap-dev roscpp"
SRC_URI = "https://github.com/shadow-robot/ethercat_grant-release/archive/release/kinetic/ethercat_grant/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a098a326dcf3581b727ffe541ba2916"
SRC_URI[sha256sum] = "5ed7a26c971fa3db0886d9661e2172d924b62d9c28244e8b9b9c5a4cdd570b58"
S = "${WORKDIR}/ethercat_grant-release-release-kinetic-ethercat_grant-0.2.1-0"

inherit catkin
