# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package gives transparency between RTM and ROS.       rtmros-data-bridge.py"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native openrtm-tools roscpp-tutorials rospy rostopic"
SRC_URI = "https://github.com/tork-a/rtmros_common-release/archive/release/kinetic/rosnode_rtc/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "73daf24b38a06c4a113d3fb1e43765d1"
SRC_URI[sha256sum] = "bb126f1601b1d3d15caeec29ed19a1db359829af3420bfa411828125f6fcba71"
S = "${WORKDIR}/rtmros_common-release-release-kinetic-rosnode_rtc-1.4.2-0"

inherit catkin
