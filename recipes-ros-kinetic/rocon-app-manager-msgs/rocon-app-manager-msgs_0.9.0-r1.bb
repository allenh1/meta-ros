# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by the platform app manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime rocon-service-pair-msgs rocon-std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/rocon_app_manager_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fe631f5c9e74c1ade4847bb5566fee60"
SRC_URI[sha256sum] = "4a0974e63257e62d1e74dbd3c11bd5eeeb714a78ccd895366da7fdf5df51dce6"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-rocon_app_manager_msgs-0.9.0-1"

inherit catkin
