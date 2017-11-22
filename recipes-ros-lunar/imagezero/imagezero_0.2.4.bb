# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ImageZero is a fast lossless image compression algorithm for RGB color photos."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin"
SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/lunar/imagezero/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6dda556e205f62b9ee7f2134b95062f"
SRC_URI[sha256sum] = "5d036e27f4d33c752ac4015e0bf5da65acb1b7a74f95f79f0e2deec8d3083ec5"
S = "${WORKDIR}/imagezero_transport-release-release-lunar-imagezero-0.2.4-0"

inherit catkin
