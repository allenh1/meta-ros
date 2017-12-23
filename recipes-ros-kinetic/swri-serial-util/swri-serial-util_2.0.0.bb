# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_serial_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_serial_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a6a794d71e4e04f6d429aa31906486d9"
SRC_URI[sha256sum] = "598d40fc27cf3729ba916206c0bf5969853e31ed727b1931ce999c98e6ebf770"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_serial_util-2.0.0-0"

inherit catkin
