# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the thormang3_common (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native thormang3-description thormang3-gazebo"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-Common-release/archive/release/kinetic/thormang3_common/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b45dc6f011fe17fc5e05cf835eeda329"
SRC_URI[sha256sum] = "7d2704ea6afe7a9855f5901bc8d27bf992f79a3efcf39194bce1f04ecef38d66"
S = "${WORKDIR}/ROBOTIS-THORMANG-Common-release-release-kinetic-thormang3_common-0.1.3-0"

inherit catkin
