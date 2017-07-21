# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This encapsulates the WebKit dependency for a specific ROS distribution and its "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-qt5-bindings-webkit"
SRC_URI = "https://github.com/ros-gbp/webkit_dependency-release/archive/release/lunar/webkit_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "211fbb5f64492bfd7c25a73ee079d74c"
SRC_URI[sha256sum] = "c7cc33a438e32df0598628be3bf1c96c6011819706c23132f5ddebc591da90cb"
S = "${WORKDIR}/webkit_dependency-release-release-lunar-webkit_dependency-1.1.0-0"

inherit catkin
