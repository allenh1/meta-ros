# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native common-tutorials geometry-tutorials robot ros-tutorials roslint visualization-tutorials viz"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6a144f2cd75a7e8ed0d045bffe115ce6"
SRC_URI[sha256sum] = "9e6045983eb808b7c51f52d2aa89087a2f602ef3af68a6621410dad2a786dfdf"
S = "${WORKDIR}/metapackages-release-release-lunar-${PN}-1.3.1-0"

inherit catkin
