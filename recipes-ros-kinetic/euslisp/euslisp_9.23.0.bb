# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "EusLisp is an integrated programming system for the   research on intelligent ro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules libjpeg libpng12-dev libpq-dev libx11-dev libxext mk opengl xfonts-100dpi xfonts-75dpi"
SRC_URI = "https://github.com/tork-a/${PN}-release/archive/release/kinetic/${PN}/9.23.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "12cd052a0edab687798bcc1e1299613b"
SRC_URI[sha256sum] = "ebad10833550ce5076c7e402033ddee8f0d8302d57b417525f1006f92951d567"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-9.23.0-0"

inherit catkin
