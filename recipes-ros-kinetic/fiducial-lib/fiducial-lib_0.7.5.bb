# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library to detect fiducials in an image stream"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native opencv3"
SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/kinetic/fiducial_lib/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4c3b80c630caeb07b61d0cc2b616ac48"
SRC_URI[sha256sum] = "7e423a9b5bbc48ab55f311e510ae6e7f605bb3b53bc94b33e70b1bb4ed419e55"
S = "${WORKDIR}/fiducials-release-release-kinetic-fiducial_lib-0.7.5-0"

inherit catkin
