# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "USB Video Class driver library"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake libjpeg libusb-1.0-dev pkgconfig"
SRC_URI = "https://github.com/ktossell/libuvc-release/archive/release/lunar/libuvc/0.0.6-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "268b2bfe77d96b57d1ff75c461c66ef8"
SRC_URI[sha256sum] = "259525af1224fb9c6157dadf288f4910121b9a506ec73345b427e08644e0a0a5"
S = "${WORKDIR}/libuvc-release-release-lunar-libuvc-0.0.6-2"

inherit catkin
