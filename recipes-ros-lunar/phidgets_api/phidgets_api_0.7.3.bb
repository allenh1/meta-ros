# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A C++ Wrapper for the Phidgets C API"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=1d2434d754c425bba92665b7a8d86174"

DEPENDS = "catkin libphidget21 libusb-1.0 libusb-1.0-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_api/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54c80b26770b9dd41d8079cc6af84b00"
SRC_URI[sha256sum] = "39e2516dca7e505ac77276068d8f2ff9d1eba6008bfa825b2470819c7ff95d90"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
