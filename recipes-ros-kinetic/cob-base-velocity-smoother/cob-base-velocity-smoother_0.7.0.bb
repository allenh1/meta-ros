# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The 'cob_base_velocity_smoother' reads velocity messages and publishes messages "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native dynamic-reconfigure geometry-msgs nav-msgs roscpp roslint std-msgs"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_base_velocity_smoother/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e8485bddf0d677af600881384df8a0b"
SRC_URI[sha256sum] = "178d349bbeec040eed7c70f91df98ed470a93bb4a06ff04b185edce708502114"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_base_velocity_smoother-0.7.0-0"

inherit catkin
