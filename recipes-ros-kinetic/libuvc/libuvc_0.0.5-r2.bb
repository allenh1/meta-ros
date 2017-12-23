# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "USB Video Class driver library"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake libusb-1.0-dev"
SRC_URI = "https://github.com/ktossell/${PN}-release/archive/release/kinetic/${PN}/0.0.5-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5a639c4c881370bd74bd34f2a765d91"
SRC_URI[sha256sum] = "ee165887deaf1d923d810f5b45ffc5e442df8405d70d667f9101b48f71f2fc1a"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.0.5-2"

inherit catkin
