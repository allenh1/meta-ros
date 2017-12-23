# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standard messages used by other rocon specific package types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime rocon-service-pair-msgs std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/rocon_std_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf552f3e48b40bd635361d43c533536f"
SRC_URI[sha256sum] = "6331f55125bd97a86bae776724a638edbb38db60afaf546a58fa79a45fe717c8"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-rocon_std_msgs-0.9.0-1"

inherit catkin
