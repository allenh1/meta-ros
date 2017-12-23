# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD & GPL-3 & LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native catkin cmake-modules control-toolbox eigen eigen-conversions geometry-msgs mavros mavros-extras roscpp std-msgs tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/test_mavros/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "25fd78c4bdf30f1b7b4ccba73f65547e"
SRC_URI[sha256sum] = "89ead97dc8307bcc20bf8b5620cc1a6ab61df3b6a270ea6cc7a3d4a4ff9f9a31"
S = "${WORKDIR}/mavros-release-release-lunar-test_mavros-0.22.0-0"

inherit catkin
