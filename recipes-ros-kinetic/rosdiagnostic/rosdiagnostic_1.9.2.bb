# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Command to print aggregated diagnostic contents to the command line"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs rospy"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/kinetic/${PN}/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8103da2f9950f439107c0848dfb8e99"
SRC_URI[sha256sum] = "a58693bb3984c69c74f60929d8f159707a521cb3591bcf61a989c4d65581e776"
S = "${WORKDIR}/diagnostics-release-release-kinetic-${PN}-1.9.2-0"

inherit catkin
