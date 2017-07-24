# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_bullet"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bullet python-empy-native geometry-msgs pkgconfig tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_bullet/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1ffe3ae09979f56af2e8858c19da58fe"
SRC_URI[sha256sum] = "939a54f0f9c2f63fcd7ca810a9396391ba8dbbc2575e6a8223f01906fff1615c"
S = "${WORKDIR}/geometry2-release-release-lunar-tf2_bullet-0.5.16-0"

inherit catkin
