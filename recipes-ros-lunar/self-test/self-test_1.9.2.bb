# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "self_test"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater roscpp rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/self_test/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a5d4d1e8b1a93c564c14e391ae5d018e"
SRC_URI[sha256sum] = "b70116a77b9b3e36857e5fa4dd70368babb6ca60d08aacbf5f2ee2ed024fff9a"
S = "${WORKDIR}/diagnostics-release-release-lunar-self_test-1.9.2-0"

inherit catkin
