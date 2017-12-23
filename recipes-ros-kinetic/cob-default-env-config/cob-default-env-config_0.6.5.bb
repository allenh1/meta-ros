# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains configuration files for the default environments for Care-"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_environments-release/archive/release/kinetic/cob_default_env_config/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "538b3865f867f3bd6b961b8451d20fcc"
SRC_URI[sha256sum] = "d21b6f131f9457bd4b6354063ca72f1e1a885748b7b20aa5562f4bfda69f544e"
S = "${WORKDIR}/cob_environments-release-release-kinetic-cob_default_env_config-0.6.5-0"

inherit catkin
