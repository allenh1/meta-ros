# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "libCMT ROS Wrapper"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ca-certificates cmake git libopencv-dev openssl"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/${PN}/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f09aa069cfbef0deb6f945d41cc7b14"
SRC_URI[sha256sum] = "292e45903724d9b81d6b0b348312fc193166fe2c0d5e6dbd7873ad89fa1936f8"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-${PN}-2.1.6-0"

inherit catkin
