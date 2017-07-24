# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains the Documentation for the p2os driver/componenets"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_doc/2.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da6bd60ace87e108b1b609b3c5cfb5ac"
SRC_URI[sha256sum] = "adc0ef289f147e3c41bbc7fb0c79550d804bcad2d0c22da018bfb4a84e0b9a11"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_doc-2.0.7-0"

inherit catkin
