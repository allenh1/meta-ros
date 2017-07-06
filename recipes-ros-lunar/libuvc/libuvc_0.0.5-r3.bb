# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake libusb-1.0-dev"
SRC_URI = "https://github.com/ktossell/libuvc-release/archive/release/lunar/libuvc/0.0.5-3.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d62efb1a56a3e8a2856cb328709df4a5"
SRC_URI[sha256sum] = "1222f7b2060cb30c78130d1fddbd4a7c661c77e76a8c9f58ba6a8e77db13c5a0"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
