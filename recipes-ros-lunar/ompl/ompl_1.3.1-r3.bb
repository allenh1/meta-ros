# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake eigen pkgconfig"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.3.1-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb306bca5d1394a8e2a7cd8a8b6091ff"
SRC_URI[sha256sum] = "7b0a7c0818dcf5f9505cb86f493ee51b1c222a0123a4582d12f00b02c4aba8b7"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.3.1-3"

inherit catkin
