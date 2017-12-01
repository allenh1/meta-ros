# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A C++ Wrapper for the Phidgets C API"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libphidget21 libusb-1.0 libusb-1.0-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_api/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "427f14f8c31ca3ef5e90978571b24ee6"
SRC_URI[sha256sum] = "65af7be1e46897f1c23804bf36ab0f16088947250743bb13db5fe9662c819551"
S = "${WORKDIR}/phidgets_drivers-release-release-lunar-phidgets_api-0.7.4-0"

inherit catkin
