# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_console_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin roscpp swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_console_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "405cf3bae8c27e39d32d65152c7d55c8"
SRC_URI[sha256sum] = "0e92da41baa0c79911fefad8df42de0178d5fe929b5fb2c37679919605642a2c"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_console_util-1.2.0-0"

inherit catkin
