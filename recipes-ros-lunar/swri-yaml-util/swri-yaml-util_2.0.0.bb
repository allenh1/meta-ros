# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides wrappers around the yaml-cpp library for various utility functions     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native pkgconfig yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_yaml_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4a71cfe998658887f3b78fba60eb422e"
SRC_URI[sha256sum] = "d54b9167ad8bdb08755c6b5c00b5310e59565a1dd5a7ab7315b37ace9b1c97a4"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_yaml_util-2.0.0-0"

inherit catkin
