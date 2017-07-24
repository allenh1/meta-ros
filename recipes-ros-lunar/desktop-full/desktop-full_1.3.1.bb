# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native desktop perception simulators urdf-tutorial"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/desktop_full/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9fe67d13c9c1e1cfb035c13852b536b3"
SRC_URI[sha256sum] = "d53f3f19383f5f94b9b462acc06c114623b6921be5c2b230362d669cb20df62f"
S = "${WORKDIR}/metapackages-release-release-lunar-desktop_full-1.3.1-0"

inherit catkin
