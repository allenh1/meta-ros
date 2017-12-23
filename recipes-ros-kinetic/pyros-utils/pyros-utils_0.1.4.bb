# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Miscellaneous tools for pyROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip rosgraph roslaunch roslint rospy rostest"
SRC_URI = "https://github.com/asmodehn/${PN}-release/archive/release/kinetic/pyros_utils/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7605a316b802d017a41f91c9ed0dc0ea"
SRC_URI[sha256sum] = "7f552d986b5ab6a141b9a0a43feb8cc77482f90ad71cc7a107f441a8dc901271"
S = "${WORKDIR}/${PN}-release-release-kinetic-pyros_utils-0.1.4-0"

inherit catkin
