# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Mesh Conversion Utility  Used to generate '.iv' files from '.stl' files.  This p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/ivcon-release/archive/release/lunar/ivcon/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9862f46f4506ebcf804073506b7b2fec"
SRC_URI[sha256sum] = "c436ad21c51e1b812f4b2466603b8f7ba407ac2b8b633486a5e95de5eb81dfc4"
S = "${WORKDIR}/ivcon-release-release-lunar-ivcon-0.1.6-0"

inherit catkin
