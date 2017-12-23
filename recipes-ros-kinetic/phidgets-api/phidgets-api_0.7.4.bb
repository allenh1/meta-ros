# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A C++ Wrapper for the Phidgets C API"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libphidget21 libusb-1.0 libusb-1.0-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/kinetic/phidgets_api/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1e95d04dbc545cc9b88f7748c58e8ad3"
SRC_URI[sha256sum] = "c81bf16f29e317f22ffe37d0ec98f5b3d1c63010c6a740a2f770f456ac54babb"
S = "${WORKDIR}/phidgets_drivers-release-release-kinetic-phidgets_api-0.7.4-0"

inherit catkin
