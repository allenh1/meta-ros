# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native desktop perception simulators urdf-tutorial"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/desktop_full/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b3ff76cf8a836f8fc0386705055790a2"
SRC_URI[sha256sum] = "581f412f468c4f635091b98283a00b82d15ad9a9d4beef83e85936a12067ac48"
S = "${WORKDIR}/metapackages-release-release-kinetic-desktop_full-1.3.1-0"

inherit catkin
