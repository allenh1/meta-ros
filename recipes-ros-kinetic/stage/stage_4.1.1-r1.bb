# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Mobile robot simulator http://rtv.github.com/Stage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native cmake gtk2 libfltk-dev libjpeg libtool opengl pkgconfig"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/4.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1af78f6e81392aa1d57fdc25b52e2d43"
SRC_URI[sha256sum] = "7fecacb03492a12cc0aac09a78065df784017702c431af4f12fbe4ef6165057f"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-4.1.1-1"

inherit catkin
