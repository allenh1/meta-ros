# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multisense catkin driver"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native multisense-bringup multisense-cal-check multisense-description multisense-lib multisense-ros"
SRC_URI = "https://github.com/carnegieroboticsllc/${PN}_ros-release/archive/release/kinetic/${PN}/4.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5fd19a6151ec2e5c6f3779a56334b926"
SRC_URI[sha256sum] = "e8cc9b3db8a6ee0fccbf2f38d9e3b2cf40236bc8ad05c73c9469ef4228bd13ac"
S = "${WORKDIR}/${PN}_ros-release-release-kinetic-${PN}-4.0.0-0"

inherit catkin
