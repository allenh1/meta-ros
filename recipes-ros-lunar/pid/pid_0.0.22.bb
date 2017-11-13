# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch a PID control node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/AndyZe/pid-release/archive/release/lunar/pid/0.0.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "902a277d3d108f9b10326a1f255387ac"
SRC_URI[sha256sum] = "7c2fea1d11cfbe496f7b1ad277bfa2d980d9230b8ba317c9eb20a78329b56e5b"
S = "${WORKDIR}/pid-release-release-lunar-pid-0.0.22-0"

inherit catkin
