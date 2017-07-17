# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_roscpp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=2ebbb9e4262db51dd47a953c0c582549"

DEPENDS = "catkin diagnostic_updater nav_msgs roscpp std_msgs std_srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_roscpp/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8fdaa157ea17464abf4742b61c3d7807"
SRC_URI[sha256sum] = "fde9b43b9d8998766b9d7c20066041afbb7be90603f5f02328999c9b5503add5"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
