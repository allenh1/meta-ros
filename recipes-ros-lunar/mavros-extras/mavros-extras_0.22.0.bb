# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra nodes and plugins for ."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPL-3 & LGPL-3 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native catkin cmake-modules geometry-msgs mavros mavros-msgs roscpp sensor-msgs std-msgs tf urdf visualization-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_extras/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0f11e709de488d28585784f76d659ad"
SRC_URI[sha256sum] = "312c83f0243966d7516c92e7f7a26d893ac0d3804b652db381c5ba6f337feb46"
S = "${WORKDIR}/mavros-release-release-lunar-mavros_extras-0.22.0-0"

inherit catkin
