# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OpenCV 3.x"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake ffmpeg libjpeg libpng-dev libtiff-dev libv4l-dev libvtk-qt libwebp-dev protobuf protobuf-dev python python-numpy zlib"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/3.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b99f22c8d080ec3bc3458293c6c2af81"
SRC_URI[sha256sum] = "1a79eaf88b45b1fd493623aec5d725fab9965c1589a6873e440ac908aba6f271"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-3.3.1-0"

inherit catkin
