# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on the SMACH visualization tools."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin smach-viewer"
SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/lunar/executive_smach_visualization/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2a3b0507042fbe59968db66e8a8492e"
SRC_URI[sha256sum] = "fb1ca600381eddb4082f9a9a68f56892f8a114e40b5cabf21db9716c2cbfb407"
S = "${WORKDIR}/executive_smach_visualization-release-release-lunar-executive_smach_visualization-2.0.2-0"

inherit catkin
