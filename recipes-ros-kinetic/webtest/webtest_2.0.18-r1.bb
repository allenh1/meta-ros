# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wraps any WSGI application and makes it easy to send test requests to that appli"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip python-bs4 python-six python-waitress python-webob"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/${PN}/2.0.18-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6238d9775498e974d5cc122efb8b597e"
SRC_URI[sha256sum] = "f57a43cc3fc7bf8ba69b138d475daed20f4d198e81f91ebf32e6d784226a5e0e"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-${PN}-2.0.18-1"

inherit catkin
