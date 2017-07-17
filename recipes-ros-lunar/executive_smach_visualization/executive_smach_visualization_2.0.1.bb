# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on the SMACH visualization tools."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=43d197fb1da3591941268ecb32058101"

DEPENDS = "catkin smach_viewer"
SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/lunar/executive_smach_visualization/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a79057a6a0224590e00cd5a2e6a8d489"
SRC_URI[sha256sum] = "02ae7d0e490e103a263c9d551383327795678f0975fe712223f8699bfcd60c84"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
