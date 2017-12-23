# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Pepperl+Fuchs R2000 laser range finder driver package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/dillenberger/pepperl_fuchs-release/archive/release/kinetic/pepperl_fuchs_r2000/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab23bdefe560371f23f076c75c599716"
SRC_URI[sha256sum] = "9c1393e1aaceeba29b9c28f36cc1fe623397e9aa32ef82de1eefb0103e530680"
S = "${WORKDIR}/pepperl_fuchs-release-release-kinetic-pepperl_fuchs_r2000-0.1.3-0"

inherit catkin
