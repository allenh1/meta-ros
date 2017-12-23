# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for embedded Linux enviroments"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_embeddedlinux/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4edbc228357d3993e03a3a2994cb301"
SRC_URI[sha256sum] = "f9d9bdc6e424e3b54c27aeaf7531e5357031c67dc2a4fa55f431b4bc38d19802"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_embeddedlinux-0.7.7-0"

inherit catkin
