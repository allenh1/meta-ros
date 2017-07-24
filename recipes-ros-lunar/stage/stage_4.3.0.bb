# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Mobile robot simulator http://rtv.github.com/Stage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "python-empy-native cmake gtk2 libfltk-dev libjpeg libtool opengl pkgconfig"
SRC_URI = "https://github.com/ros-gbp/stage-release/archive/release/lunar/stage/4.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d46e91e64fa5f0bea9460966e008462b"
SRC_URI[sha256sum] = "5db7bd45355204cb67f1c1be41ae551da558bcfb6ce754eb390e407a8d8d1a2e"
S = "${WORKDIR}/stage-release-release-lunar-stage-4.3.0-0"

inherit catkin
