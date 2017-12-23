# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demo of safe_teleop in stage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joy safe-teleop-base stage"
SRC_URI = "https://github.com/ros-gbp/shared_autonomy_manipulation-release/archive/release/kinetic/safe_teleop_stage/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a657c96358b046cefa258e7785eddf93"
SRC_URI[sha256sum] = "61902ee607a1d1a078a41dd75b371142cdf2dcd8070ae1466197857fc8ef4686"
S = "${WORKDIR}/shared_autonomy_manipulation-release-release-kinetic-safe_teleop_stage-0.0.2-0"

inherit catkin
